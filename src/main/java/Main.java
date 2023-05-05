public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post .name = "Иван";
        post.passport = "7777 №777777";
        post.patronymic = "Иванович";
        post.phone = "+7-111-111-11-11";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.moth =06;
        post.birthday.year = 1999;
    }
}
