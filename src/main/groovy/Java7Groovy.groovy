class Java7Groovy {

    public static void main(String[] args) {
        String text = "Hello";
        switch (text) {
            case "Hello":
                println "Hello"
                break
        }

        List<String> stringList = new ArrayList<>()
        multiCatch()
    }


    static void multiCatch() {
        try {
            throw new FileNotFoundException()
        } catch (FileNotFoundException | IOException e) {
            println e
        }
    }
}

