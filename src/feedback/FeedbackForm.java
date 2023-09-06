package feedback;

import io.github.stepio.jgforms.question.MetaData;

public enum FeedbackForm implements MetaData {

    EXERCISE_ID(2058183318),
    FINISHED(217828241),
    UNDERSTOOD(676697552),
    COMMENT(379660172);

    private long id;

    FeedbackForm(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}