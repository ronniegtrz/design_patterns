package state;
/**
 * @author Ronnie 
 * 
 */

public class FirstGradeState extends State {
    public FirstGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/first.txt");
    }
/**
 * 
 * increases the grade and gets the vocabularyList from SecondGradeState
 */
   @Override
   public void increaseGrade() {
    vocabularyList.setState(vocabularyList.getSecondGradeState());

   }
/**(non-Javadoc)
 * 
 *leaving this blank because first grade is already at the lowest grade
 */
   @Override 
   public void decreaseGrade() {
   }
}
