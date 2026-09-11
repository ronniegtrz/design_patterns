package state;
/**
 * @author Ronnie
 * 
 */
public class SecondGradeState extends State {
    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        words = FileReader.getWords("state/second.txt");
    }
@Override 
    public void increaseGrade() {
        vocabularyList.setState(vocabularyList.getThirdGradeState());
    }
@Override 
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getFirstGradeState());
    }
}
