package kiosk;

import data.*;
import services.ElectoralOrganism;
import services.MailerService;

/**
* Implements a simplification of Use Case: Emit eVote
*/
public class VotingKiosk {

    private ElectoralOrganism electoralOrganism;
    private MailerService mailerService;

    private Party votedParty;
    private VoteCounter voteCounter;

    public VotingKiosk(VoteCounter vC) { this.voteCounter = vC;}

    public void setElectoralOrganism(ElectoralOrganism eO) { this.electoralOrganism = eO; }

    public void setMailerService(MailerService mService){ this.mailerService = mService; }

    public void vote(Party party) {
        try{
            this.voteCounter.scrutinize(party);
            this.votedParty = party;
        }catch(Exception e){
            System.out.println("Error, voting an invalid party");
        }
    }

    public void sendeReceipt(MailAddress address) {
        DigitalSignature digitalSignature = this.electoralOrganism.askForDigitalSignature(votedParty);
        mailerService.send(address, digitalSignature);
    }
}