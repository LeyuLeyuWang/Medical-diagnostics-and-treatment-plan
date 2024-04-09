package edu.neu.mgen;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MedicalSystem 
{
    public static void main( String[] args )
    {
        SystemManager systemManager = new SystemManager();
        DataInitializer.initializeData(systemManager);
        
        Symptom cough = systemManager.getSymptomByName("Cough");
        Symptom headache = systemManager.getSymptomByName("Headache");
        Symptom muscleAche = systemManager.getSymptomByName("Muscle Ache");



        List<Symptom> inputSymptoms = new ArrayList<>();
        inputSymptoms.add(cough);
        inputSymptoms.add(headache);
        inputSymptoms.add(muscleAche);
        
        

       System.out.println("Diagnosis: ");
        Map<Illness, Double> illnessScores = systemManager.diagnosis(inputSymptoms);
        for (Illness illness : illnessScores.keySet()) {
            System.out.println(illness.getName() + ": " + illnessScores.get(illness));
        }

        


    }
}
