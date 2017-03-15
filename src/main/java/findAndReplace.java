public class findAndReplace{

  public String find(String a, String b, String c){
    String[] wordsArray = a.split(" ");
    String toReplace = b;
    int lengthToReplace = b.length();
    String replacer = c;
    String beforeReplace = "";
    String afterReplace = "";
    String finalWord ="";

    for (int i=0; i< wordsArray.length; i++){
      if (wordsArray[i].contains(b)){
        String[] lettersArray = wordsArray[i].split("");
        for (int j=0; j <(lettersArray.length -(lengthToReplace));j++){
            String temp = "";
            System.out.println("looping---"+j);
          for(int k=0; k < lengthToReplace; k++){
             temp = temp+lettersArray[j+k];
             System.out.println("k--- "+temp);

          }
          if (!temp.equals(b)){
            //this stores before
            beforeReplace = beforeReplace+lettersArray[j];
            System.out.println("before---"+beforeReplace);
          } else {
            // we found our word
            System.out.println("found word, in else loop ");

            if (j+lengthToReplace < (lettersArray.length)){
              //not at end
              System.out.println("not at end of word...");
              for (int l=j+lengthToReplace; l<lettersArray.length;l++){
                afterReplace = afterReplace + lettersArray[l];
                System.out.println("after--"+afterReplace);
              }
            }
          }
        }
      }
    }
    finalWord = beforeReplace + replacer+afterReplace;
    return finalWord;
  }
}
