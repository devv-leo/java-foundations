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
