package edu.neu.mgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager {
    private List<Symptom> symptoms = new ArrayList<>();
    private List<Illness> illnesses = new ArrayList<>();

    private Map<Symptom, Map<Illness, Double>> symptomIllnessWeights = new HashMap<>();

    public void addSymptom(Symptom symptom) {
        symptoms.add(symptom);
        symptomIllnessWeights.put(symptom, new HashMap<>());
    }

    public void addIllness(Illness illness) {
        illnesses.add(illness);
    }

    public void addWeight(Symptom symptom, Illness illness, Double weight) {
        if (symptomIllnessWeights.containsKey(symptom)) {
            symptomIllnessWeights.get(symptom).put(illness, weight);
        }
    }

}
