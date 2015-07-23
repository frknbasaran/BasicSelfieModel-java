public class Instagram {

  public final static Integer barzoCount = 22;
  private String gender;
  private String comments[] = new String;
  private Boolean isFamous;
  public Integer likeCount;

  public static Instagram() {
    System.out.println("Bismillah");
  }

  public Instagram(String gender) {
    this.gender = gender;
    this.isFamous = true;
    this.likeCount = 1;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Boolean getIsFamous() {
    return this.isFamous;
  }

  public void setIsFamous(Boolean isFamous) {
    this.isFamous = isFamous;
  }

}

public class Selfie extends Instagram {
  private Boolean showBoobs;

  public Selfie(gender) {
    super(gender);
    this.showBoobs = true;
  }

  public Boolean getShowBoobs() {
    return this.showBoobs;
  }

  public void setShowBoobs(Boolean showBoobs) {
    this.showBoobs = showBoobs;
  }

  public void takePhoto(showBoobs) {
    this.showBoobs = showBoobs;

    if (showBoobs) {
      this.setIsFamous(true);
    }

    if (this.gender == "male" && !this.isFamous) {
      this.like = 7;
    } else if (this.gender == "male" && this.isFamous) {
      this.like = 300 - Instagram.barzoCount;
    } else if (this.gender == "female") {
      if (!this.isFamous) {
        this.like = 20;
      } else {
        this.like = 700;
      }

      while (this.showBoobs && Instagram.barzoCount < 150) {
        this.comments.push("Memeni Aç böğğhhğh");
        this.like++;
        Instagram.barzoCount--;
      }
    } else {
      System.out.println("aq faşisti eray az pride pls");
    }

  }

}

Pelin = new Selfie("female");
Pelin.takePhoto(true);
