public void main(String[] args) {
    SystemZarzadzania system = new SystemZarzadzania();
    Admin admin = new Admin();
    BazaLogowan baza = new BazaLogowan("test123");
    admin.zarejestrujUzytkownika("olafbog","lubieplacki",0);
    admin.zarejestrujUzytkownika("olafbog2","lubieuczyc",1);

    Scanner scanner = new Scanner(System.in);
    Optional<Uzytkownik> user = Optional.empty();
    while (true) { // trzeba zrobic tak zeby byly 3 proby
        System.out.println("Wpisz login oraz haslo"); // pierw patrz login czy istnieje potem haslo
        String login,haslo;
        login = scanner.nextLine().replace(" ", "");
        haslo = scanner.nextLine().replace(" ", "");

        user = baza.sprawdzWPliku(login,haslo);
        if(user.isPresent()) {
            break;
        }
    }
    String ranga = baza.znajdzRange();
    switch (ranga) {
        case "0":
            break;
        case "1":
            break;
        case "2":
            break;
    }
}