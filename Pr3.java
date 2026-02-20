public class Pr3 {
    
    static class StepCounter {
        private static int totalSteps = 0;
        private int mySteps = 0;
        private String name;
        
        public StepCounter(String name) {
            this.name = name;
        }
        
        public void walk(int steps) {
            mySteps += steps;
            totalSteps += steps;
        }
        
        public static void resetGlobal() {
            totalSteps = 0;
        }
        
        public void show() {
            System.out.println(name + ": " + mySteps + " steps");
        }
        
        public static void showGlobal() {
            System.out.println("Total: " + totalSteps + " steps");
        }
    }

    public static void main(String[] args) {
        StepCounter userA = new StepCounter("Ali");
        StepCounter userB = new StepCounter("Vali");
        userA.walk(500);
        userA.walk(300);
        userB.walk(400);
        userB.walk(600);
        userA.show(); 
        userB.show();  
        StepCounter.showGlobal();
        StepCounter.resetGlobal();
        StepCounter.showGlobal();
    }
}
