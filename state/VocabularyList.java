package state;
/**
 * @author Ronnie
 * VocabularyList
 */
public class VocabularyList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;
/**
 * state is used to point to a grade.
 */
    public VocabularyList(){
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }
    /**
     * whatever state is pointing to will return
     */
    public String getNextDefinition(){
        return state.getNextDefinition();
    }
    public String getMatchingWord(String definition) {
        return state.getMatchingWord(definition); 
    }
    public void increaseGrade() {
        state.increaseGrade();
    }
    public void decreaseGrade() {
        state.decreaseGrade();
    }
    public State getFirstGradeState() {
        return firstGradeState;
    }
    public State getSecondGradeState() {
        return secondGradeState;
    }
    public State getThirdGradeState() {
        return thirdGradeState;
    }
    /**
     * the "sticky note" mover. changes what state points to. 
     * @param state
     */
    public void setState(State state) {
        this.state = state; 
    }
}
