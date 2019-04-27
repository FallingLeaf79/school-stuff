import java.io.IOException;
import java.util.zip.*;
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ZippyBoi {

    public static void main(String[] args) throws IOException {
        boolean printList = false;
        String zipName = null;

        for (String arg : args) {
            if (arg.equals("-t")) {
                printList = true;
            } else {
                zipName = arg;
            }
        }

        if (zipName == null) {
            return;
        }

        if (printList) {
            ZipFile file = new ZipFile(zipName);
            Enumeration<? extends ZipEntry> files = file.entries();
            List<String> names = new ArrayList<String>();

            while (files.hasMoreElements()) {
                ZipEntry entry = files.nextElement();
                names.add(entry.getName());
            }

            Collections.sort(names);
            for (String name : names) {
                System.out.println(name);
            }
            file.close();
        }
    }
}
