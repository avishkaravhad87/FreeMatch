// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * 
 *         
 *         The <code>&lt;project&gt;</code> element is the root of
 * the descriptor.
 *         The following table lists all of the possible child
 * elements.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Model
    extends ModelBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Declares to which version of project descriptor this POM
     * conforms.
     */
    private String modelVersion;

    /**
     * The location of the parent project, if one exists. Values
     * from the parent
     *             project will be the default for this project if
     * they are left unspecified. The location
     *             is given as a group ID, artifact ID and version.
     */
    private Parent parent;

    /**
     * 
     *             
     *             A universally unique identifier for a project.
     * It is normal to
     *             use a fully-qualified package name to
     * distinguish it from other
     *             projects with a similar name (eg.
     * <code>org.apache.maven</code>).
     *             
     *           
     */
    private String groupId;

    /**
     * The identifier for this artifact that is unique within the
     * group given by the
     *             group ID. An artifact is something that is
     * either produced or used by a project.
     *             Examples of artifacts produced by Maven for a
     * project include: JARs, source and binary
     *             distributions, and WARs.
     */
    private String artifactId;

    /**
     * The current version of the artifact produced by this project.
     */
    private String version;

    /**
     * 
     *             
     *             The type of artifact this project produces, for
     * example <code>jar</code>
     *               <code>war</code>
     *               <code>ear</code>
     *               <code>pom</code>.
     *             Plugins can create their own packaging, and
     *             therefore their own packaging types,
     *             so this list does not contain all possible
     * types.
     *             
     *           
     */
    private String packaging = "jar";

    /**
     * The full name of the project.
     */
    private String name;

    /**
     * A detailed description of the project, used by Maven
     * whenever it needs to
     *             describe the project, such as on the web site.
     * While this element can be specified as
     *             CDATA to enable the use of HTML tags within the
     * description, it is discouraged to allow
     *             plain text representation. If you need to modify
     * the index page of the generated web
     *             site, you are able to specify your own instead
     * of adjusting this text.
     */
    private String description;

    /**
     * 
     *             
     *             The URL to the project's homepage.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or project.directory
     * property), or just parent value if
     *             project's
     * <code>child.project.url.inherit.append.path="false"</code>
     *             
     *           
     */
    private String url;

    /**
     * 
     *             
     *             When children inherit from project's url, append
     * path or not? Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br><b>Default value is</b>: <code>true</code>
     *             <br><b>Since</b>: Maven 3.6.1
     *             
     *           .
     */
    private String childProjectUrlInheritAppendPath;

    /**
     * The year of the project's inception, specified with 4
     * digits. This value is
     *             used when generating copyright notices as well
     * as being informational.
     */
    private String inceptionYear;

    /**
     * This element describes various attributes of the
     * organization to which the
     *             project belongs. These attributes are utilized
     * when documentation is created (for
     *             copyright notices and links).
     */
    private Organization organization;

    /**
     * Field licenses.
     */
    private java.util.List<License> licenses;

    /**
     * Field developers.
     */
    private java.util.List<Developer> developers;

    /**
     * Field contributors.
     */
    private java.util.List<Contributor> contributors;

    /**
     * Field mailingLists.
     */
    private java.util.List<MailingList> mailingLists;

    /**
     * Describes the prerequisites in the build environment for
     * this project.
     */
    private Prerequisites prerequisites;

    /**
     * Specification for the SCM used by the project, such as CVS,
     * Subversion, etc.
     */
    private Scm scm;

    /**
     * The project's issue management system information.
     */
    private IssueManagement issueManagement;

    /**
     * The project's continuous integration information.
     */
    private CiManagement ciManagement;

    /**
     * Information required to build the project.
     */
    private Build build;

    /**
     * Field profiles.
     */
    private java.util.List<Profile> profiles;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addContributor.
     * 
     * @param contributor a contributor object.
     */
    public void addContributor( Contributor contributor )
    {
        getContributors().add( contributor );
    } //-- void addContributor( Contributor )

    /**
     * Method addDeveloper.
     * 
     * @param developer a developer object.
     */
    public void addDeveloper( Developer developer )
    {
        getDevelopers().add( developer );
    } //-- void addDeveloper( Developer )

    /**
     * Method addLicense.
     * 
     * @param license a license object.
     */
    public void addLicense( License license )
    {
        getLicenses().add( license );
    } //-- void addLicense( License )

    /**
     * Method addMailingList.
     * 
     * @param mailingList a mailingList object.
     */
    public void addMailingList( MailingList mailingList )
    {
        getMailingLists().add( mailingList );
    } //-- void addMailingList( MailingList )

    /**
     * Method addProfile.
     * 
     * @param profile a profile object.
     */
    public void addProfile( Profile profile )
    {
        getProfiles().add( profile );
    } //-- void addProfile( Profile )

    /**
     * Method clone.
     * 
     * @return Model
     */
    public Model clone()
    {
        try
        {
            Model copy = (Model) super.clone();

            if ( this.parent != null )
            {
                copy.parent = (Parent) this.parent.clone();
            }

            if ( this.organization != null )
            {
                copy.organization = (Organization) this.organization.clone();
            }

            if ( this.licenses != null )
            {
                copy.licenses = new java.util.ArrayList<License>();
                for ( License item : this.licenses )
                {
                    copy.licenses.add( ( (License) item).clone() );
                }
            }

            if ( this.developers != null )
            {
                copy.developers = new java.util.ArrayList<Developer>();
                for ( Developer item : this.developers )
                {
                    copy.developers.add( ( (Developer) item).clone() );
                }
            }

            if ( this.contributors != null )
            {
                copy.contributors = new java.util.ArrayList<Contributor>();
                for ( Contributor item : this.contributors )
                {
                    copy.contributors.add( ( (Contributor) item).clone() );
                }
            }

            if ( this.mailingLists != null )
            {
                copy.mailingLists = new java.util.ArrayList<MailingList>();
                for ( MailingList item : this.mailingLists )
                {
                    copy.mailingLists.add( ( (MailingList) item).clone() );
                }
            }

            if ( this.prerequisites != null )
            {
                copy.prerequisites = (Prerequisites) this.prerequisites.clone();
            }

            if ( this.scm != null )
            {
                copy.scm = (Scm) this.scm.clone();
            }

            if ( this.issueManagement != null )
            {
                copy.issueManagement = (IssueManagement) this.issueManagement.clone();
            }

            if ( this.ciManagement != null )
            {
                copy.ciManagement = (CiManagement) this.ciManagement.clone();
            }

            if ( this.build != null )
            {
                copy.build = (Build) this.build.clone();
            }

            if ( this.profiles != null )
            {
                copy.profiles = new java.util.ArrayList<Profile>();
                for ( Profile item : this.profiles )
                {
                    copy.profiles.add( ( (Profile) item).clone() );
                }
            }

            cloneHook( copy );

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- Model clone()

    /**
     * Get the identifier for this artifact that is unique within
     * the group given by the
     *             group ID. An artifact is something that is
     * either produced or used by a project.
     *             Examples of artifacts produced by Maven for a
     * project include: JARs, source and binary
     *             distributions, and WARs.
     * 
     * @return String
     */
    public String getArtifactId()
    {
        return this.artifactId;
    } //-- String getArtifactId()

    /**
     * Get information required to build the project.
     * 
     * @return Build
     */
    public Build getBuild()
    {
        return this.build;
    } //-- Build getBuild()

    /**
     * Get when children inherit from project's url, append path or
     * not? Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br><b>Default value is</b>: <code>true</code>
     *             <br><b>Since</b>: Maven 3.6.1.
     * 
     * @return String
     */
    public String getChildProjectUrlInheritAppendPath()
    {
        return this.childProjectUrlInheritAppendPath;
    } //-- String getChildProjectUrlInheritAppendPath()

    /**
     * Get the project's continuous integration information.
     * 
     * @return CiManagement
     */
    public CiManagement getCiManagement()
    {
        return this.ciManagement;
    } //-- CiManagement getCiManagement()

    /**
     * Method getContributors.
     * 
     * @return List
     */
    public java.util.List<Contributor> getContributors()
    {
        if ( this.contributors == null )
        {
            this.contributors = new java.util.ArrayList<Contributor>();
        }

        return this.contributors;
    } //-- java.util.List<Contributor> getContributors()

    /**
     * Get a detailed description of the project, used by Maven
     * whenever it needs to
     *             describe the project, such as on the web site.
     * While this element can be specified as
     *             CDATA to enable the use of HTML tags within the
     * description, it is discouraged to allow
     *             plain text representation. If you need to modify
     * the index page of the generated web
     *             site, you are able to specify your own instead
     * of adjusting this text.
     * 
     * @return String
     */
    public String getDescription()
    {
        return this.description;
    } //-- String getDescription()

    /**
     * Method getDevelopers.
     * 
     * @return List
     */
    public java.util.List<Developer> getDevelopers()
    {
        if ( this.developers == null )
        {
            this.developers = new java.util.ArrayList<Developer>();
        }

        return this.developers;
    } //-- java.util.List<Developer> getDevelopers()

    /**
     * Get a universally unique identifier for a project. It is
     * normal to
     *             use a fully-qualified package name to
     * distinguish it from other
     *             projects with a similar name (eg.
     * <code>org.apache.maven</code>).
     * 
     * @return String
     */
    public String getGroupId()
    {
        return this.groupId;
    } //-- String getGroupId()

    /**
     * Get the year of the project's inception, specified with 4
     * digits. This value is
     *             used when generating copyright notices as well
     * as being informational.
     * 
     * @return String
     */
    public String getInceptionYear()
    {
        return this.inceptionYear;
    } //-- String getInceptionYear()

    /**
     * Get the project's issue management system information.
     * 
     * @return IssueManagement
     */
    public IssueManagement getIssueManagement()
    {
        return this.issueManagement;
    } //-- IssueManagement getIssueManagement()

    /**
     * Method getLicenses.
     * 
     * @return List
     */
    public java.util.List<License> getLicenses()
    {
        if ( this.licenses == null )
        {
            this.licenses = new java.util.ArrayList<License>();
        }

        return this.licenses;
    } //-- java.util.List<License> getLicenses()

    /**
     * Method getMailingLists.
     * 
     * @return List
     */
    public java.util.List<MailingList> getMailingLists()
    {
        if ( this.mailingLists == null )
        {
            this.mailingLists = new java.util.ArrayList<MailingList>();
        }

        return this.mailingLists;
    } //-- java.util.List<MailingList> getMailingLists()

    /**
     * Get the modelEncoding field.
     * 
     * @return String
     */
    public String getModelEncoding()
    {
        return this.modelEncoding;
    } //-- String getModelEncoding()

    /**
     * Get declares to which version of project descriptor this POM
     * conforms.
     * 
     * @return String
     */
    public String getModelVersion()
    {
        return this.modelVersion;
    } //-- String getModelVersion()

    /**
     * Get the full name of the project.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get this element describes various attributes of the
     * organization to which the
     *             project belongs. These attributes are utilized
     * when documentation is created (for
     *             copyright notices and links).
     * 
     * @return Organization
     */
    public Organization getOrganization()
    {
        return this.organization;
    } //-- Organization getOrganization()

    /**
     * Get the type of artifact this project produces, for example
     * <code>jar</code>
     *               <code>war</code>
     *               <code>ear</code>
     *               <code>pom</code>.
     *             Plugins can create their own packaging, and
     *             therefore their own packaging types,
     *             so this list does not contain all possible
     * types.
     * 
     * @return String
     */
    public String getPackaging()
    {
        return this.packaging;
    } //-- String getPackaging()

    /**
     * Get the location of the parent project, if one exists.
     * Values from the parent
     *             project will be the default for this project if
     * they are left unspecified. The location
     *             is given as a group ID, artifact ID and version.
     * 
     * @return Parent
     */
    public Parent getParent()
    {
        return this.parent;
    } //-- Parent getParent()

    /**
     * Get describes the prerequisites in the build environment for
     * this project.
     * 
     * @return Prerequisites
     */
    public Prerequisites getPrerequisites()
    {
        return this.prerequisites;
    } //-- Prerequisites getPrerequisites()

    /**
     * Method getProfiles.
     * 
     * @return List
     */
    public java.util.List<Profile> getProfiles()
    {
        if ( this.profiles == null )
        {
            this.profiles = new java.util.ArrayList<Profile>();
        }

        return this.profiles;
    } //-- java.util.List<Profile> getProfiles()

    /**
     * Get specification for the SCM used by the project, such as
     * CVS, Subversion, etc.
     * 
     * @return Scm
     */
    public Scm getScm()
    {
        return this.scm;
    } //-- Scm getScm()

    /**
     * Get the URL to the project's homepage.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or project.directory
     * property), or just parent value if
     *             project's
     * <code>child.project.url.inherit.append.path="false"</code>
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Get the current version of the artifact produced by this
     * project.
     * 
     * @return String
     */
    public String getVersion()
    {
        return this.version;
    } //-- String getVersion()

    /**
     * Method removeContributor.
     * 
     * @param contributor a contributor object.
     */
    public void removeContributor( Contributor contributor )
    {
        getContributors().remove( contributor );
    } //-- void removeContributor( Contributor )

    /**
     * Method removeDeveloper.
     * 
     * @param developer a developer object.
     */
    public void removeDeveloper( Developer developer )
    {
        getDevelopers().remove( developer );
    } //-- void removeDeveloper( Developer )

    /**
     * Method removeLicense.
     * 
     * @param license a license object.
     */
    public void removeLicense( License license )
    {
        getLicenses().remove( license );
    } //-- void removeLicense( License )

    /**
     * Method removeMailingList.
     * 
     * @param mailingList a mailingList object.
     */
    public void removeMailingList( MailingList mailingList )
    {
        getMailingLists().remove( mailingList );
    } //-- void removeMailingList( MailingList )

    /**
     * Method removeProfile.
     * 
     * @param profile a profile object.
     */
    public void removeProfile( Profile profile )
    {
        getProfiles().remove( profile );
    } //-- void removeProfile( Profile )

    /**
     * Set the identifier for this artifact that is unique within
     * the group given by the
     *             group ID. An artifact is something that is
     * either produced or used by a project.
     *             Examples of artifacts produced by Maven for a
     * project include: JARs, source and binary
     *             distributions, and WARs.
     * 
     * @param artifactId a artifactId object.
     */
    public void setArtifactId( String artifactId )
    {
        this.artifactId = artifactId;
    } //-- void setArtifactId( String )

    /**
     * Set information required to build the project.
     * 
     * @param build a build object.
     */
    public void setBuild( Build build )
    {
        this.build = build;
    } //-- void setBuild( Build )

    /**
     * Set when children inherit from project's url, append path or
     * not? Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br><b>Default value is</b>: <code>true</code>
     *             <br><b>Since</b>: Maven 3.6.1.
     * 
     * @param childProjectUrlInheritAppendPath a
     * childProjectUrlInheritAppendPath object.
     */
    public void setChildProjectUrlInheritAppendPath( String childProjectUrlInheritAppendPath )
    {
        this.childProjectUrlInheritAppendPath = childProjectUrlInheritAppendPath;
    } //-- void setChildProjectUrlInheritAppendPath( String )

    /**
     * Set the project's continuous integration information.
     * 
     * @param ciManagement a ciManagement object.
     */
    public void setCiManagement( CiManagement ciManagement )
    {
        this.ciManagement = ciManagement;
    } //-- void setCiManagement( CiManagement )

    /**
     * Set describes the contributors to a project that are not yet
     * committers.
     * 
     * @param contributors a contributors object.
     */
    public void setContributors( java.util.List<Contributor> contributors )
    {
        this.contributors = contributors;
    } //-- void setContributors( java.util.List )

    /**
     * Set a detailed description of the project, used by Maven
     * whenever it needs to
     *             describe the project, such as on the web site.
     * While this element can be specified as
     *             CDATA to enable the use of HTML tags within the
     * description, it is discouraged to allow
     *             plain text representation. If you need to modify
     * the index page of the generated web
     *             site, you are able to specify your own instead
     * of adjusting this text.
     * 
     * @param description a description object.
     */
    public void setDescription( String description )
    {
        this.description = description;
    } //-- void setDescription( String )

    /**
     * Set describes the committers of a project.
     * 
     * @param developers a developers object.
     */
    public void setDevelopers( java.util.List<Developer> developers )
    {
        this.developers = developers;
    } //-- void setDevelopers( java.util.List )

    /**
     * Set a universally unique identifier for a project. It is
     * normal to
     *             use a fully-qualified package name to
     * distinguish it from other
     *             projects with a similar name (eg.
     * <code>org.apache.maven</code>).
     * 
     * @param groupId a groupId object.
     */
    public void setGroupId( String groupId )
    {
        this.groupId = groupId;
    } //-- void setGroupId( String )

    /**
     * Set the year of the project's inception, specified with 4
     * digits. This value is
     *             used when generating copyright notices as well
     * as being informational.
     * 
     * @param inceptionYear a inceptionYear object.
     */
    public void setInceptionYear( String inceptionYear )
    {
        this.inceptionYear = inceptionYear;
    } //-- void setInceptionYear( String )

    /**
     * Set the project's issue management system information.
     * 
     * @param issueManagement a issueManagement object.
     */
    public void setIssueManagement( IssueManagement issueManagement )
    {
        this.issueManagement = issueManagement;
    } //-- void setIssueManagement( IssueManagement )

    /**
     * Set this element describes all of the licenses for this
     * project.
     *             Each license is described by a
     * <code>license</code> element, which
     *             is then described by additional elements.
     *             Projects should only list the license(s) that
     * applies to the project
     *             and not the licenses that apply to dependencies.
     *             If multiple licenses are listed, it is assumed
     * that the user can select
     *             any of them, not that they must accept all.
     * 
     * @param licenses a licenses object.
     */
    public void setLicenses( java.util.List<License> licenses )
    {
        this.licenses = licenses;
    } //-- void setLicenses( java.util.List )

    /**
     * Set contains information about a project's mailing lists.
     * 
     * @param mailingLists a mailingLists object.
     */
    public void setMailingLists( java.util.List<MailingList> mailingLists )
    {
        this.mailingLists = mailingLists;
    } //-- void setMailingLists( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding a modelEncoding object.
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

    /**
     * Set declares to which version of project descriptor this POM
     * conforms.
     * 
     * @param modelVersion a modelVersion object.
     */
    public void setModelVersion( String modelVersion )
    {
        this.modelVersion = modelVersion;
    } //-- void setModelVersion( String )

    /**
     * Set the full name of the project.
     * 
     * @param name a name object.
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set this element describes various attributes of the
     * organization to which the
     *             project belongs. These attributes are utilized
     * when documentation is created (for
     *             copyright notices and links).
     * 
     * @param organization a organization object.
     */
    public void setOrganization( Organization organization )
    {
        this.organization = organization;
    } //-- void setOrganization( Organization )

    /**
     * Set the type of artifact this project produces, for example
     * <code>jar</code>
     *               <code>war</code>
     *               <code>ear</code>
     *               <code>pom</code>.
     *             Plugins can create their own packaging, and
     *             therefore their own packaging types,
     *             so this list does not contain all possible
     * types.
     * 
     * @param packaging a packaging object.
     */
    public void setPackaging( String packaging )
    {
        this.packaging = packaging;
    } //-- void setPackaging( String )

    /**
     * Set the location of the parent project, if one exists.
     * Values from the parent
     *             project will be the default for this project if
     * they are left unspecified. The location
     *             is given as a group ID, artifact ID and version.
     * 
     * @param parent a parent object.
     */
    public void setParent( Parent parent )
    {
        this.parent = parent;
    } //-- void setParent( Parent )

    /**
     * Set describes the prerequisites in the build environment for
     * this project.
     * 
     * @param prerequisites a prerequisites object.
     */
    public void setPrerequisites( Prerequisites prerequisites )
    {
        this.prerequisites = prerequisites;
    } //-- void setPrerequisites( Prerequisites )

    /**
     * Set a listing of project-local build profiles which will
     * modify the build process
     *             when activated.
     * 
     * @param profiles a profiles object.
     */
    public void setProfiles( java.util.List<Profile> profiles )
    {
        this.profiles = profiles;
    } //-- void setProfiles( java.util.List )

    /**
     * Set specification for the SCM used by the project, such as
     * CVS, Subversion, etc.
     * 
     * @param scm a scm object.
     */
    public void setScm( Scm scm )
    {
        this.scm = scm;
    } //-- void setScm( Scm )

    /**
     * Set the URL to the project's homepage.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or project.directory
     * property), or just parent value if
     *             project's
     * <code>child.project.url.inherit.append.path="false"</code>
     * 
     * @param url a url object.
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    /**
     * Set the current version of the artifact produced by this
     * project.
     * 
     * @param version a version object.
     */
    public void setVersion( String version )
    {
        this.version = version;
    } //-- void setVersion( String )

    
            
    private void cloneHook( Model copy )
    {
        copy.pomFile = pomFile;
    }

    /**
     * The POM from which this model originated. This is transient runtime state and therefore not managed by Modello.
     */
    private java.io.File pomFile;

    /**
     * Gets the POM file for the corresponding project (if any).
     *
     * @return The POM file from which this model originated or {@code null} if this model does not belong to a local
     *         project (e.g. describes the metadata of some artifact from the repository).
     */
    public java.io.File getPomFile()
    {
        return pomFile;
    }

    public void setPomFile( java.io.File pomFile )
    {
        this.pomFile = ( pomFile != null ) ? pomFile.getAbsoluteFile() : null;
    }

    /**
     * Gets the base directory for the corresponding project (if any).
     *
     * @return The base directory for the corresponding project or {@code null} if this model does not belong to a local
     *         project (e.g. describes the metadata of some artifact from the repository).
     */
    public java.io.File getProjectDirectory()
    {
        return ( pomFile != null ) ? pomFile.getParentFile() : null;
    }

    /**
     * @return the model id as <code>groupId:artifactId:packaging:version</code>
     */
    public String getId()
    {
        StringBuilder id = new StringBuilder( 64 );

        id.append( ( getGroupId() == null ) ? "[inherited]" : getGroupId() );
        id.append( ":" );
        id.append( getArtifactId() );
        id.append( ":" );
        id.append( getPackaging() );
        id.append( ":" );
        id.append( ( getVersion() == null ) ? "[inherited]" : getVersion() );

        return id.toString();
    }

    @Override
    public String toString()
    {
        return getId();
    }
            
          
    
            

    public boolean isChildProjectUrlInheritAppendPath()
    {
        return ( childProjectUrlInheritAppendPath != null ) ? Boolean.parseBoolean( childProjectUrlInheritAppendPath ) : true;
    }

    public void setChildProjectUrlInheritAppendPath( boolean childProjectUrlInheritAppendPath )
    {
        this.childProjectUrlInheritAppendPath = String.valueOf( childProjectUrlInheritAppendPath );
    }

            
          
}
