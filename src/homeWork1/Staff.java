package homeWork1;

import java.util.List;

/**
 * метод сотрудники наследуется от базового типа человек
 */
public class Staff extends Human {
    private Post post;
    public static int index;

    public Staff(String name, String yearOfBirth, List<String> phoneNumber, List<String> listFieldsHuman, String post) {
        super(name, yearOfBirth, phoneNumber, listFieldsHuman);
        setPost(Post.valueOf(post));
    }

    static {
        index = 1;
    }

    public Staff(String name, Post post) {
        super(name);
        //super.setName("Name" + index++);
        setPost(post);
    }

    public Staff() {

    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
