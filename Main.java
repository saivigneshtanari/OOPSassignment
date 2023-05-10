import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main{

  public static void main(String[] args){

    Map<String,Integer> hscMarks = new HashMap<>();
    hscMarks.put("Maths",90);
    hscMarks.put("Physics",90);
    hscMarks.put("Chemistry",90);

    Candidate candidate1 = new Candidate("Sai Vignesh","29/07/1999",hscMarks,8.9,9.1,5,86,"Indian");
    Candidate candidate2 = new Candidate("Poonam K","08/07/1999",hscMarks,8.4,6.1,5,76,"Indian");
    Candidate candidate3 = new Candidate("Karthik S","12/08/2000",hscMarks,8.1,9.1,3,86,"Indian");
    Candidate candidate4 = new Candidate("Arya Prasanth","02/09/2002",hscMarks,8.3,9.1,6,96,"Indian");
    Candidate candidate5 = new Candidate("Sakrithi Sinha","11/06/2000",hscMarks,9.1,9.3,8,92,"Indian");
    Candidate candidate6 = new Candidate("Ramul Shamla","21/03/2001",hscMarks,9.2,8.6,2,82,"Indian");
    Candidate candidate7 = new Candidate("Aneefa P","01/02/1999",hscMarks,8.5,8.1,7,88,"Indian");
    Candidate candidate8 = new Candidate("Sunil Nane","17/09/2000",hscMarks,8.7,9.0,4,94,"Indian");
    Candidate candidate9 = new Candidate("Gupesh Gupta","23/04/1998",hscMarks,9.0,9.2,5,90,"Indian");
    Candidate candidate10 = new Candidate("Haranya Shah","12/12/1997",hscMarks,8.3,9.3,3,89,"Indian");

    List<Candidate> candidates = List.of(candidate1,candidate2,candidate3,candidate4, candidate5, candidate6, candidate7, candidate8, candidate9, candidate10);
    HRTeam hrTeam = new HRTeam();
    List<Candidate> eligibleCandidates = hrTeam.getEligibleCandidates(candidates);

    System.out.println("\n\n");
    hrTeam.informCandidates(candidates);
    System.out.println("\n\nDetails of the selected candidate: \n");
    hrTeam.printEligibleCandidatesDetails(eligibleCandidates);
  }
}

