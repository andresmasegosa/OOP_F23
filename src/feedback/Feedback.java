package feedback;

import io.github.stepio.jgforms.Configuration;
import io.github.stepio.jgforms.Submitter;
import io.github.stepio.jgforms.answer.Builder;
import io.github.stepio.jgforms.exception.NotSubmittedException;

import java.net.URL;

import static feedback.FeedbackForm.*;


public class Feedback {

    public static void submit(String excercise_id, boolean finished, boolean understood, String comment) {
        try {

            URL url = Builder.formKey("1FAIpQLSfMEXmf1Tyd7sdSClQJ33jCYR9SBWMy-OIyXZuyyvZS99flmA")
                    .put(EXERCISE_ID, excercise_id)
                    .put(FINISHED, (finished)? "Yes": "No")
                    .put(UNDERSTOOD, (understood)? "Yes": "No")
                    .put(COMMENT, comment)
                    .toUrl();

            System.out.println(url);
            Submitter submitter = new Submitter(
                    new Configuration()
            );

            submitter.submitForm(url);
            System.out.println("********************************************");
            System.out.println("Feedback submitted for the exercise. Thanks! :)");
            System.out.println("********************************************");


        } catch (Exception ex) {

        }
    }
}
