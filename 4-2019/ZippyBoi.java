import java.io.IOException;
import java.util.zip.*;
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ZippyBoi {

    public static void main(String[] args) throws IOException {
        boolean printList = false;
        boolean printMeta = false;
        boolean extract = false;
        boolean isTargetDir = false;
        boolean makeSubDir = false;

        String zipName = null;
        String targetDir = null;

        for (String arg : args) {
            if (isTargetDir) {
                targetDir = arg;
                isTargetDir = false;
            } else {
                switch (arg) {
                    case "-t":
                        printList = true;
                        break;
                    case "-l":
                        printMeta = true;
                        break;
                    case "-x":
                        extract = true;
                        break;
                    case "-d":
                        isTargetDir = true;
                        break;
                    case "-D":
                        makeSubDir = true;
                        break;
                    default:
                        zipName = arg;
                }
            }
        }

        if (zipName == null) {
            return;
        }

        ZipFile file = new ZipFile(zipName);
        Enumeration<? extends ZipEntry> files = file.entries();
        List<ZipEntry> entries = new ArrayList<ZipEntry>();

        while (files.hasMoreElements()) {
            entries.add(files.nextElement());
        }

        if (printList) {

            if (printMeta) {
                System.out.printf(
                "%-50s %-31s %s\n",
                "File name",
                "Last modified",
                "Uncompressed size (in bytes)"
                );
            }

            for (ZipEntry entry : entries) {
                String out = printMeta ?
                    String.format(
                        "%-50s %tc   %s",
                        entry.getName(),
                        entry.getTime(),
                        entry.getSize()
                    ) :
                    entry.getName();
                System.out.println(out);
            }
            file.close();
        }
    }
}
