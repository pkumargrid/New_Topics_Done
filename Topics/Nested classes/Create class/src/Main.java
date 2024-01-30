class StringOperations {

    // create static nested class EngString
    static class EngString{
        boolean english;
        String string;
        EngString(boolean english,String string){
            this.english = english;
            this.string = string;
        }

        public String getString() {
            return string;
        }

        public boolean isEnglish() {
            return english;
        }
    }

}