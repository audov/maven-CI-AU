public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Алена";
        post.patronicName = "Викторовна";
        post.surname = "Удовиченко";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1985;
        post.passport = "15 01 225336";
        post.phone = "+7 915 352 55 99";
        post.subscription = true;
    }
}
