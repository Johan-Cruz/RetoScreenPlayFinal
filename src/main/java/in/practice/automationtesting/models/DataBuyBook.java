package in.practice.automationtesting.models;

public class DataBuyBook {
    private String quantity;
    private String bookName;
    private String nameUser;
    private String lastName;
    private String company;
    private String email;
    private String telephone;
    private String search_country;
    private String address1;
    private String address2;
    private String city;
    private String county_state;
    private String postcode;
    private String password;

    public DataBuyBook(String quantity,String bookName, String nameUser,String lastName, String company,String email,
                       String telephone,String search_country,String address1, String address2,String city,
                       String county_state,String postcode, String password){
        this.quantity= quantity;
        this.bookName=bookName;
        this.nameUser=nameUser;
        this.lastName=lastName;
        this.company=company;
        this.email=email;
        this.telephone=telephone;
        this.search_country=search_country;
        this.address1=address1;
        this.address2=address2;
        this.city=city;
        this.county_state=county_state;
        this.postcode=postcode;
        this.password=password;
    }

    public String getQuantity(){
        return quantity;
    }
    public String getBookName(){ return bookName;}
    public String getNameUser(){ return nameUser;}
    public String getLastName(){ return lastName;}
    public String getCompany(){ return company;}
    public String getEmail(){return email;  }
    public String getTelephone(){ return telephone;}
    public String getSearch_country(){ return search_country;}
    public String getAddress1(){ return address1;}
    public String getAddress2(){ return address2;}
    public String getCity(){ return city;}
    public String getCounty_state(){ return county_state;}
    public String getPostcode(){ return postcode;}
    public String getPassword(){ return password;}


}
