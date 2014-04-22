package gitcontrol;

import java.io.IOException;
import org.eclipse.jgit.api.errors.GitAPIException;

/**
 *
 * @author Mario Pérez Esteso
 *
 */

public class Test {
    
    public static void main(String[] args) throws IOException, GitAPIException {
        String localPath = "/home/user/repos/gittutorial";
        String remotePath = "https://github.com/GeekyTheory/GitTutorial.git";
        GitControl gc = new GitControl(localPath, remotePath);
        //Clone repository
        gc.cloneRepo();
        //Add files to repository
        gc.addToRepo();
        //Commit with a custom message
        gc.commitToRepo("Modified testfile.txt");
        //Push commits
        gc.pushToRepo();
        //Pull
        gc.pullFromRepo();
    }
    
}
