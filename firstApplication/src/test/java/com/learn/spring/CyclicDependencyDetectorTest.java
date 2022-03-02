package com.learn.spring;

import java.util.*;

public class CyclicDependencyDetectorTest {
    /**
     *
     Module_A
     |--- Module_B              AB
     |--- Module_C              AC          ==> list
     |--- Module_D              AD

     Module_B
     |--- Module_C              ABC
     |--- Module_F              ABF

     Module_C
     |--- Module_A              ACA     ABCA
     |--- Module_D              ACD     ABCD

     Module_D
     ...

     */
    static class Module {
        /* name of the module */
        String name;

        /* dependencies (module name) of this module */
        Set<String> dependencies;

        public Module(String name, Set<String> dependencies){
            this.name =  name;
            this.dependencies =  dependencies;
        }

    }




    private static HashMap<String, Module> moduleHashMap = new HashMap<>();

    public static void checkCyclicDependency(List<Module> module, Module startModule) {
        // TODO : implement here
        // print out the dependency tree if cyclic dependecy detected
        /**
         Module_A
         Module_B
         Module_XXX
         ...
         Module_A
         */
        List<String> dependencyOrderList = new ArrayList<>();
        // self order
        for(String depName : startModule.dependencies){
            dependencyOrderList.add(startModule.name + depName);
        }

        // dependency order
        for(String depName : startModule.dependencies){
            for(String orderList : dependencyOrderList){

            }
        }

    }

    public static void main(String[] args) {
        System.out.println(String.format("%.2s","12.53"));
//        Module A = new Module("A", new HashSet<String>(){
//            {
//                add("B");
//                add("C");
//                add("D");
//            }
//        });
//        Module B = new Module("B", new HashSet<String>(){
//            {
//                add("C");
//                add("F");
//            }
//        });
//        Module C = new Module("C", new HashSet<String>(){
//            {
//                add("A");
//                add("D");
//            }
//        });
//        Module D = new Module("D",null);
//        List<Module> moduleList = new ArrayList<>();
//        moduleList.add(A);
//        moduleList.add(B);
//        moduleList.add(C);
//        moduleList.add(D);
//
//        addModuleToMap(moduleList);
//
//        checkCyclicDependency(moduleList, A);
    }

    static void addModuleToMap(List<Module> moduleList){
        for(Module module : moduleList){
            moduleHashMap.put(module.name, module);
        }
    }

}
