package com.company;
public class Main {
    public static void main(String[] args) {
        ProcessHandle P = ProcessHandle.current();
        System.out.println("Process Id : "+P.pid());
        System.out.println("Direct Children : "+P.children());
        System.out.println("Class name : "+P.getClass());
        System.out.println("All process : "+ProcessHandle.allProcesses());
        System.out.println("Process Info : "+P.info());
        System.out.println("Is Process is Alive : "+P.isAlive());
        System.out.println("Process's parent : "+P.parent());
    }
}
