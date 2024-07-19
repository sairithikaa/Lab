public class WordCount {
    public static void main(String[] args) {
        String sentence = "Sum of 12 and 20 is 32";
        System.out.println("Numbers of words in sentence is : "+sentence);
        int count = 1;
        for(int i = 0;i< sentence.length();i++){
            if((sentence.charAt(i)== ' ')&&(sentence.charAt(i+1)!= ' ')){
                count++;
            }
            System.out.println("Numbers of words in given string is : "+count);

        }
    }
}
