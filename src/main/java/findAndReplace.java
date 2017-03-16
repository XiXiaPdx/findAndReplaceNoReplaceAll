public class findAndReplace{

  public String find(String a, String b, String c){
    String[] wordsArray = a.split(" ");
    String toReplace = b;
    int lengthToReplace = b.length();
    String replacer = c;
    String finalWord ="";


    for (int i=0; i< wordsArray.length; i++){
      if (wordsArray[i].contains(b)){
        String[] lettersArray = wordsArray[i].split("");
        for (int j=0; j <lettersArray.length;j++){
            String temp = "";
            System.out.println("looping---"+j);
            int tempCounter = 0;
          while (tempCounter < lengthToReplace){
            temp = temp+lettersArray[j+tempCounter];
            System.out.println("temp--- "+tempCounter+"-"+temp);
            tempCounter++;
              if (tempCounter+j >= lettersArray.length){
                tempCounter = lengthToReplace;
              }
          }
          if (!temp.equals(b)){
            //this stores before
            finalWord = finalWord+lettersArray[j];
            System.out.println("before---"+finalWord);
          } else {
            // we found our word...
            finalWord = finalWord + replacer;
            System.out.println("final WITh replace----"+finalWord);
            j+=lengthToReplace-1;
          }
        }
      }
    }
    return finalWord;
  }
}
