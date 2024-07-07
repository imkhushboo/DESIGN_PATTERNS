package Adapter_Design_Pattern.Adapter;

import Adapter_Design_Pattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double weightInKgs() {
        double weight = weightMachine.weightInPounds();

        // convert to Kgs

        weight = weight * .45;

        return weight;
    }
}
