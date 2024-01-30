class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()
    public void putTreeTopper(String color){
        TreeTopper tp = new TreeTopper(color);
        tp.sparkle();
    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        public void sparkle(){
            System.out.println("Sparkling silver tree topper looks stunning with green Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}