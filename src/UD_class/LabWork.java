package UD_class;

public class LabWork {
    public static void main(String[] args) {

        String[] names = {"john", "happoooy", "peACe", "jOy", "LEarN"};
        String nameToSearch = "learn";
        for (int i = 0; i < names.length; i++) {
            String newName = names[i];
            if (newName.equalsIgnoreCase(nameToSearch)) {
                System.out.println("Name: "+names[i]+" was found at index "+i);
            }
            }

        for (int i = 0; i < names.length; i++) {
            String newName = names[i];
            if (names[i].length()>5 && names[i].contains("o")) {
                System.out.println(names[i]);
            }
            }
        }


    }

