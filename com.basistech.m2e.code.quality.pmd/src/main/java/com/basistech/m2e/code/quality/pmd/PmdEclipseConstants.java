/*******************************************************************************
 * Copyright 2010 Mohan KR
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.basistech.m2e.code.quality.pmd;


/**
 * Constants as it relates to eclipse PMD plugin
 */
public final class PmdEclipseConstants {

    public static final String LOG_PREFIX = "M2E-PMD";
    public static final String MAVEN_PLUGIN_GROUPID = "org.apache.maven.plugins";
    public static final String MAVEN_PLUGIN_ARTIFACTID = "maven-pmd-plugin";

    /**
     * PMD assumes that any full ruleset file should end with ".xml".
     * <p/>
     * If not, PMD tries to analyze the path to the ruleset file
     * ... and makes incorrect assumptions which crashes the Eclipse project import.
     */
    public static final String PMD_RULESET_FILE = ".pmdrulset.xml";

    /**
     * The standard name of the Eclipse PMD configuration file within the
     * Maven project root directory.
     */
    public static final String PMD_SETTINGS_FILE = ".pmd";

    private PmdEclipseConstants() {
        //no instantiation.
    }
}
