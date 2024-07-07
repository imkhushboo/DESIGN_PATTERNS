package Adapter_Design_Pattern.Client;

import Adapter_Design_Pattern.Adaptee.WeightMachineForBabies;
import Adapter_Design_Pattern.Adapter.WeightMachineAdapter;
import Adapter_Design_Pattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println(weightMachineAdapter.weightInKgs());
    }
}
