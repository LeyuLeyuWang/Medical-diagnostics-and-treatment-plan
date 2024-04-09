package edu.neu.mgen;

public class DataInitializer {

    public static void initializeData(SystemManager systemManager) {

        Illness cold = new Illness("Cold",
                "Rest, increase fluid intake, and consider OTC medications such as Acetaminophen for fever and pain.");
        Illness influenza = new Illness("Influenza",
                "Start antiviral drugs like Oseltamivir within 48 hours of symptom onset, alongside symptomatic treatment with Ibuprofen.");
        Illness pharyngitis = new Illness("Pharyngitis",
                "For bacterial cases, take prescribed antibiotics such as Amoxicillin. Use throat lozenges and Ibuprofen for pain relief.");
        Illness covid19 = new Illness("COVID-19",
                "Manage mild symptoms at home with rest and hydration. Severe cases may require hospitalization and treatment with antivirals or steroids like Dexamethasone.");
        Illness sinusitis = new Illness("Sinusitis",
                "Treat with decongestants such as Pseudoephedrine and saline nasal sprays. Antibiotics like Amoxicillin for bacterial sinusitis.");
        Illness bronchitis = new Illness("Bronchitis",
                "Use expectorants like Guaifenesin to loosen mucus and cough suppressants if needed. Stay hydrated and rest.");
        Illness myocarditis = new Illness("Myocarditis",
                "Treatment might involve medications such as ACE inhibitors for heart function support, alongside rest and monitoring.");
        Illness asthma = new Illness("Asthma",
                "Regular use of inhaled corticosteroids like Budesonide for control, and rescue inhalers such as Albuterol for acute symptoms.");

        Symptom cough = new Symptom("Cough");
        Symptom fever = new Symptom("Fever");
        Symptom headache = new Symptom("Headache");
        Symptom soreThroat = new Symptom("Sore Throat");
        Symptom muscleAche = new Symptom("Muscle Ache");
        Symptom fatigue = new Symptom("Fatigue");
        Symptom lossOfSmell = new Symptom("Loss of Smell");
        Symptom lossOfTaste = new Symptom("Loss of Taste");
        Symptom shortnessOfBreath = new Symptom("Shortness of Breath");
        Symptom chestPain = new Symptom("Chest Pain");

        systemManager.addIllness(cold);
        systemManager.addIllness(influenza);
        systemManager.addIllness(pharyngitis);
        systemManager.addIllness(covid19);
        systemManager.addIllness(sinusitis);
        systemManager.addIllness(bronchitis);
        systemManager.addIllness(myocarditis);
        systemManager.addIllness(asthma);

        systemManager.addSymptom(cough);
        systemManager.addSymptom(fever);
        systemManager.addSymptom(headache);
        systemManager.addSymptom(soreThroat);
        systemManager.addSymptom(muscleAche);
        systemManager.addSymptom(fatigue);
        systemManager.addSymptom(lossOfSmell);
        systemManager.addSymptom(lossOfTaste);
        systemManager.addSymptom(shortnessOfBreath);
        systemManager.addSymptom(chestPain);

        systemManager.addWeight(cough, cold, 0.5);
        systemManager.addWeight(fever, cold, 0.3);
        systemManager.addWeight(headache, cold, 0.2);
        systemManager.addWeight(soreThroat, cold, 0.4);
        systemManager.addWeight(muscleAche, cold, 0.2);

        systemManager.addWeight(cough, influenza, 0.6);
        systemManager.addWeight(fever, influenza, 0.7); 
        systemManager.addWeight(headache, influenza, 0.5);
        systemManager.addWeight(soreThroat, influenza, 0.4);
        systemManager.addWeight(muscleAche, influenza, 0.6);

        systemManager.addWeight(cough, pharyngitis, 0.4);
        systemManager.addWeight(fever, pharyngitis, 0.3);
        systemManager.addWeight(headache, pharyngitis, 0.2);
        systemManager.addWeight(soreThroat, pharyngitis, 0.8);
        systemManager.addWeight(muscleAche, pharyngitis, 0.1);

        systemManager.addWeight(cough, covid19, 0.7);
        systemManager.addWeight(fever, covid19, 0.8);
        systemManager.addWeight(headache, covid19, 0.4);
        systemManager.addWeight(soreThroat, covid19, 0.3);
        systemManager.addWeight(muscleAche, covid19, 0.5);
        systemManager.addWeight(fatigue, covid19, 0.6);
        systemManager.addWeight(lossOfSmell, covid19, 0.7);
        systemManager.addWeight(lossOfTaste, covid19, 0.7);
        systemManager.addWeight(shortnessOfBreath, covid19, 0.6);
        systemManager.addWeight(chestPain, covid19, 0.4);

        systemManager.addWeight(headache, sinusitis, 0.7);
        systemManager.addWeight(soreThroat, sinusitis, 0.5);
        systemManager.addWeight(fever, sinusitis, 0.4);
        systemManager.addWeight(fatigue, sinusitis, 0.3);
        
        systemManager.addWeight(cough, bronchitis, 0.8);
        systemManager.addWeight(fever, bronchitis, 0.5);
        systemManager.addWeight(shortnessOfBreath, bronchitis, 0.6);
        systemManager.addWeight(chestPain, bronchitis, 0.4);

        systemManager.addWeight(fatigue, myocarditis, 0.7);
        systemManager.addWeight(chestPain, myocarditis, 0.8);
        systemManager.addWeight(shortnessOfBreath, myocarditis, 0.5);
        systemManager.addWeight(headache, myocarditis, 0.3);

        systemManager.addWeight(shortnessOfBreath, asthma, 0.9);
        systemManager.addWeight(chestPain, asthma, 0.5);
        systemManager.addWeight(cough, asthma, 0.6);
        systemManager.addWeight(lossOfSmell, asthma, 0.2);
        systemManager.addWeight(lossOfTaste, asthma, 0.2);


    }

}