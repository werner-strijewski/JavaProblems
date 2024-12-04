package org.strijewski.problems.towerOfHanoi;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveTowerOfHanoi(n, 'A', 'C', 'B');
    }

    public static void solveTowerOfHanoi(int n, char source, char target, char auxiliary) {
        // Base case: If there's only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        // Recursive case: Move n-1 disks from source to auxiliary using target
        solveTowerOfHanoi(n - 1, source, auxiliary, target);

        // Move the nth disk from source to target
        System.out.println("Move disk " + n + " from " + source + " to " + target);

        // Move n-1 disks from auxiliary to target using source
        solveTowerOfHanoi(n - 1, auxiliary, target, source);
    }
}
