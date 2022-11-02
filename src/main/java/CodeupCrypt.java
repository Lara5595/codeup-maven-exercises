

public class CodeupCrypt {

    static double version;


    //  Methods
        public static String hashPassword(String aString) {
            String hash = "";
            for (char character : aString.toCharArray()) {
                switch (character){
                    case 'a':
                    case 'A':
                        hash += 4;
                        break;
                    case 'e':
                    case 'E':
                        hash += 3;
                        break;
                    case 'i':
                    case 'I':
                        hash += 1;
                        break;
                    case 'o':
                    case 'O':
                        hash += 0;
                        break;
                    case 'u':
                    case 'U':
                        hash += 9;
                        break;
                    default:
                        hash += character;
                }
            }
            return hash;
        }

        public static boolean checkPassword(String pass, String hash) {
            return hash.equals(hashPassword(pass));
        }
}


// To see this procedure in action we will create a CodeupCrypt class that has the following requirements:
//
//The class should have a double static property called version that is not initialized, but it could set any floating number to simulate we have a version number.
//It should have a method called hashPassword that takes in a string parameter, hashes it into a new string, and returns it.
//It should have a method called checkPassword that compares two string parameters to make sure they match with a valid hash.
//The hashing procedure should be pretty simple, just replace the original String's vowels with numbers, these are the rules: