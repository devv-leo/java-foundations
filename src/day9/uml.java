package day9;

import java.util.ArrayList;

class Problem {
    String name;
    String description;
    String type;
    boolean isSolved;

    Problem(String name, String type) {
        this.name = name;
        this.type = type;
        this.description = "";
        this.isSolved = false;
    }
}

class Person {
    ArrayList<Problem> problems = new ArrayList<Problem>();

    void addProblem(Problem p) {
        problems.add(p);
    }

    void solveProblem(String name) {
        for (int i = 0; i < problems.size(); i++) {
            if (problems.get(i).name.equals(name)) {
                problems.get(i).isSolved = true;
            }
        }
    }

    void listUnsolvedProblems() {
        for (int i = 0; i < problems.size(); i++) {
            if (!problems.get(i).isSolved) {
                System.out.println(problems.get(i).name + " (" + problems.get(i).type + ")");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person leo = new Person();

        leo.addProblem(new Problem("Rent", "FINANCIAL"));
        leo.addProblem(new Problem("Career path", "BUSINESS"));
        leo.addProblem(new Problem("Math exam", "EDUCATION"));

        leo.solveProblem("Rent");

        System.out.println("Unsolved problems:");
        leo.listUnsolvedProblems();
    }
}