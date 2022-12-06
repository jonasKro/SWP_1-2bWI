public class caesar {
    public static void main(String[] args){
        int encryptioncount = 2;
        char word[] = {'c','a','e','s','a','r'};
        char test = 32;

        test += encryptioncount;

        for (int i=0; i<6;i++){
            char letter = word[i];
            letter+= encryptioncount;
            word[i] = letter;
        }
        System.out.println(word);

        for (int i=0; i<6;i++){
            char letter = word[i];
            letter-= encryptioncount;
            word[i] = letter;
        }
        System.out.println(word);

    }

}


