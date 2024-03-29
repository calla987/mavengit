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

import java.io.File;
import java.io.IOException;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.MergeResult;
import org.eclipse.jgit.api.MergeResult.MergeStatus;
import org.eclipse.jgit.api.PullResult;
import org.eclipse.jgit.api.errors.GitAPIException;

/**
 *
 * @author Philippe Tjon - A - Hen, philippe@tjonahen.nl
 */
public class CheckForUpdates {

    public boolean execute(String repo) throws IOException, GitAPIException {

        return refreshNeeded(Git.open(new File(repo)).pull().call());
    }

    private boolean refreshNeeded(PullResult pullResult) {
        if (pullResult == null) {
            return true;
        }
        MergeResult mergeResult = pullResult.getMergeResult();
        if (mergeResult == null) {
            return true;
        }
        if (mergeResult.getMergeStatus() == MergeStatus.ALREADY_UP_TO_DATE) {
            return false;
        }
        return true;
    }
}
