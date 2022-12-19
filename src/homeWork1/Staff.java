package homeWork1;

import java.util.List;

/**
 * метод сотрудники наследуется от базового типа человек
 */
public class Staff extends Human{
    private Post post;

    public Staff(String name, String yearOfBirth, List<String> phoneNumber, List<String> listFieldsHuman, String post) {
        super(name, yearOfBirth, phoneNumber, listFieldsHuman);
        setPost(Post.valueOf(post));
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
