package state;
/**
 * @author Ronnie
 * 
 */
public class ThirdGradeState extends State {
    public ThirdGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        words = FileReader.getWords("state/third.txt");
    }
/**
 * 
 * leaving this empty because its the last grade
 */
@Override 
    public void increaseGrade(){
       
    }
@Override 
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}
