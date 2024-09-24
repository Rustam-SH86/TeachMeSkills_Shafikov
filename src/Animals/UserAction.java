package Animals;

public enum UserAction {

    FEED(1,"Feed"),
    SPEAK(2,"Speek"),
    WALK(3,"Walk"),
    SWIM(4,"Swim"),
    FLY(5,"Fly"),
    BACK(6,"Back <- ");
    private int code;
    private String description;

    UserAction(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
