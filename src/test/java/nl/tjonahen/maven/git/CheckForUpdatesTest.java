/*
 * Copyright (C) 2015 Philippe Tjon - A - Hen, philippe@tjonahen.nl
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nl.tjonahen.maven.git;

import java.io.IOException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.Test;

/**
 *
 * @author Philippe Tjon - A - Hen, philippe@tjonahen.nl
 */
public class CheckForUpdatesTest {
    

    @Test
    public void testExecute() throws IOException, GitAPIException {
        final CheckForUpdates sut = new CheckForUpdates();
        
        if (sut.execute("/home/ordina/tmp/mavengit")) {
            System.out.println("Refresh is needed......");
        }
    }
    
}
