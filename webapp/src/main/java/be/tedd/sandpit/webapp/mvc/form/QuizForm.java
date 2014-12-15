package be.tedd.sandpit.webapp.mvc.form;

import be.tedd.sandpit.webapp.model.Colour;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 */
public class QuizForm {

    public static final int NUMBER_MIN = 10;
    public static final int NUMBER_MAX = 20;

    public static final int TEXT_MIN_SIZE = 1;
    public static final int TEXT_MAX_SIZE = 10;

    public static final Boolean CORRECT_STATE = Boolean.TRUE;

    public static final Colour FAVOURITE_COLOUR = Colour.BLUE;

    @NotNull()
    @Min(NUMBER_MIN)
    @Max(NUMBER_MAX)
    private Integer number;


    @NotNull
    @Size(min=TEXT_MIN_SIZE, max=TEXT_MAX_SIZE)
    private String text;

    private Boolean state;

    private Colour colour;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
