package org.licenseheader.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal process-files
 */
public class Mojo
    extends AbstractMojo {

    public void execute()
        throws MojoExecutionException {
        getLog().info("Licenseheader Maven Plugin");
    }
}
