public class MuseumArtifacts {

    int artifactID;
    String origin;
    int century;

    // we know only the ID | constructor
    public MuseumArtifacts(int artifactID){
        this.artifactID = artifactID;
        System.out.println("Artifact's ID: " + this.artifactID);

    }

    // we know the ID ad origin | constructor
    public MuseumArtifacts(int artifactID, String origin){
        this.artifactID = artifactID;
        this.origin = origin;
        System.out.println("Artifact's ID and origin: " + this.artifactID + ", " + this.origin);
    }
    // we know ID, origin and century | constructor
    public MuseumArtifacts(int artifactID, String origin, int century){
        this.artifactID = artifactID;
        this.origin = origin;
        this.century = century;
        System.out.println("Artifact's ID, origin adn century: " + this.artifactID + ", " + this.origin + ", " + this.century);
    }

    public static void main(String[] args) {

        MuseumArtifacts bowl = new MuseumArtifacts(1294);
        MuseumArtifacts coin = new MuseumArtifacts(3947, "Egypt");
        MuseumArtifacts sward = new MuseumArtifacts(8459, "Normandy", 18);

    }
}

// 3 types of artifacts in the museum
// constructors for 3 types of artifacts
// this