package sg.edu.np.mad.madpractical;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    User(String n, String desc, int i, boolean f) {
        name = n;
        description = desc;
        id = i;
        followed = f;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean getFollowed() {
        return followed;
    }
}
