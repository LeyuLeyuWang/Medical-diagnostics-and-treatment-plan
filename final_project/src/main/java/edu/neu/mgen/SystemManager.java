package edu.neu.mgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager {
    private List<Symptom> symptoms = new ArrayList<>();
    private List<Illness> illnesses = new ArrayList<>();

    private Map<Symptom, Map<Illness, Double>> symptomIllnessWeights = new HashMap<>();

    public SystemManager() {
    }

    public void addSymptom(Symptom symptom) {
        symptoms.add(symptom);
        symptomIllnessWeights.put(symptom, new HashMap<>());
    }

    public void addIllness(Illness illness) {
        illnesses.add(illness);
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public List<Illness> getIllnesses() {
        return illnesses;
    }

    public void addWeight(Symptom symptom, Illness illness, Double weight) {
        if (symptomIllnessWeights.containsKey(symptom)) {
            symptomIllnessWeights.get(symptom).put(illness, weight);
        }
    }

    public Double getWeightForSymptomAndIllness(Symptom symptom, Illness illness) {
        Map<Illness, Double> weights = symptomIllnessWeights.get(symptom);
        if (weights != null) {
            return weights.getOrDefault(illness, 0.0);
        }
        return 0.0; 
    }
    
    public Symptom getSymptomByName(String name) {
        for (Symptom symptom : symptoms) {
            if (symptom.getName().equalsIgnoreCase(name)) {
                return symptom;
            }
        }
        return null;
    }
    

    public Map<Illness, Double> diagnosis(List<Symptom> inputSymptoms) {
        Map<Illness, Double> illnessScores = new HashMap<>();
        double totalScore = 0;

        for (Illness illness : illnesses) {
            double score = 0;
            for (Symptom symptom : inputSymptoms) {
                Double weight = getWeightForSymptomAndIllness(symptom, illness);
                if (weight != null) {
                    score += weight;
                }
            }
            illnessScores.put(illness, score);
            totalScore += score;
        }

        if (totalScore == 0) {
            return illnessScores;
        }

        for (Map.Entry<Illness, Double> entry : illnessScores.entrySet()) {

            entry.setValue((entry.getValue() / totalScore) * 100);
        }

        return illnessScores;
    }

}
