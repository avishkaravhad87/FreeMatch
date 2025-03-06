// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.settings;

/**
 * 
 *         
 *         Modifications to the build process which is keyed on
 * some
 *         sort of environmental parameter.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Profile
    extends IdentifiableBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             The conditional logic which will automatically
     *             trigger the inclusion of this profile.
     *             
     *           
     */
    private Activation activation;

    /**
     * Field properties.
     */
    private java.util.Properties properties;

    /**
     * Field repositories.
     */
    private java.util.List<Repository> repositories;

    /**
     * 
     *             
     *             This may be removed or relocated in the near
     *             future. It is undecided whether plugins really
     * need a remote
     *             repository set of their own.
     *             
     *           
     */
    private java.util.List<Repository> pluginRepositories;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPluginRepository.
     * 
     * @param repository a repository object.
     */
    public void addPluginRepository( Repository repository )
    {
        getPluginRepositories().add( repository );
    } //-- void addPluginRepository( Repository )

    /**
     * Method addProperty.
     * 
     * @param key a key object.
     * @param value a value object.
     */
    public void addProperty( String key, String value )
    {
        getProperties().put( key, value );
    } //-- void addProperty( String, String )

    /**
     * Method addRepository.
     * 
     * @param repository a repository object.
     */
    public void addRepository( Repository repository )
    {
        getRepositories().add( repository );
    } //-- void addRepository( Repository )

    /**
     * Method clone.
     * 
     * @return Profile
     */
    public Profile clone()
    {
        try
        {
            Profile copy = (Profile) super.clone();

            if ( this.activation != null )
            {
                copy.activation = (Activation) this.activation.clone();
            }

            if ( this.properties != null )
            {
                copy.properties = (java.util.Properties) this.properties.clone();
            }

            if ( this.repositories != null )
            {
                copy.repositories = new java.util.ArrayList<Repository>();
                for ( Repository item : this.repositories )
                {
                    copy.repositories.add( ( (Repository) item).clone() );
                }
            }

            if ( this.pluginRepositories != null )
            {
                copy.pluginRepositories = new java.util.ArrayList<Repository>();
                for ( Repository item : this.pluginRepositories )
                {
                    copy.pluginRepositories.add( ( (Repository) item).clone() );
                }
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- Profile clone()

    /**
     * Get the conditional logic which will automatically
     *             trigger the inclusion of this profile.
     * 
     * @return Activation
     */
    public Activation getActivation()
    {
        return this.activation;
    } //-- Activation getActivation()

    /**
     * Method getPluginRepositories.
     * 
     * @return List
     */
    public java.util.List<Repository> getPluginRepositories()
    {
        if ( this.pluginRepositories == null )
        {
            this.pluginRepositories = new java.util.ArrayList<Repository>();
        }

        return this.pluginRepositories;
    } //-- java.util.List<Repository> getPluginRepositories()

    /**
     * Method getProperties.
     * 
     * @return Properties
     */
    public java.util.Properties getProperties()
    {
        if ( this.properties == null )
        {
            this.properties = new java.util.Properties();
        }

        return this.properties;
    } //-- java.util.Properties getProperties()

    /**
     * Method getRepositories.
     * 
     * @return List
     */
    public java.util.List<Repository> getRepositories()
    {
        if ( this.repositories == null )
        {
            this.repositories = new java.util.ArrayList<Repository>();
        }

        return this.repositories;
    } //-- java.util.List<Repository> getRepositories()

    /**
     * Method removePluginRepository.
     * 
     * @param repository a repository object.
     */
    public void removePluginRepository( Repository repository )
    {
        getPluginRepositories().remove( repository );
    } //-- void removePluginRepository( Repository )

    /**
     * Method removeRepository.
     * 
     * @param repository a repository object.
     */
    public void removeRepository( Repository repository )
    {
        getRepositories().remove( repository );
    } //-- void removeRepository( Repository )

    /**
     * Set the conditional logic which will automatically
     *             trigger the inclusion of this profile.
     * 
     * @param activation a activation object.
     */
    public void setActivation( Activation activation )
    {
        this.activation = activation;
    } //-- void setActivation( Activation )

    /**
     * Set the lists of the remote repositories for discovering
     * plugins.
     * 
     * @param pluginRepositories a pluginRepositories object.
     */
    public void setPluginRepositories( java.util.List<Repository> pluginRepositories )
    {
        this.pluginRepositories = pluginRepositories;
    } //-- void setPluginRepositories( java.util.List )

    /**
     * Set extended configuration specific to this profile goes
     * here.
     *             Contents take the form of
     *            
     * <code>&lt;property.name&gt;property.value&lt;/property.name&gt;</code>
     * 
     * @param properties a properties object.
     */
    public void setProperties( java.util.Properties properties )
    {
        this.properties = properties;
    } //-- void setProperties( java.util.Properties )

    /**
     * Set the lists of the remote repositories.
     * 
     * @param repositories a repositories object.
     */
    public void setRepositories( java.util.List<Repository> repositories )
    {
        this.repositories = repositories;
    } //-- void setRepositories( java.util.List )

}
