// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.toolchain.model;

/**
 * 
 *          The <code>&lt;toolchains&gt;</code> element is the root
 * of the descriptor.
 *          The following table lists all of the possible child
 * elements.
 *             
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class PersistedToolchains
    extends TrackableBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field toolchains.
     */
    private java.util.List<ToolchainModel> toolchains;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addToolchain.
     * 
     * @param toolchainModel a toolchainModel object.
     */
    public void addToolchain( ToolchainModel toolchainModel )
    {
        getToolchains().add( toolchainModel );
    } //-- void addToolchain( ToolchainModel )

    /**
     * Method clone.
     * 
     * @return PersistedToolchains
     */
    public PersistedToolchains clone()
    {
        try
        {
            PersistedToolchains copy = (PersistedToolchains) super.clone();

            if ( this.toolchains != null )
            {
                copy.toolchains = new java.util.ArrayList<ToolchainModel>();
                for ( ToolchainModel item : this.toolchains )
                {
                    copy.toolchains.add( ( (ToolchainModel) item).clone() );
                }
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- PersistedToolchains clone()

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
     * Method getToolchains.
     * 
     * @return List
     */
    public java.util.List<ToolchainModel> getToolchains()
    {
        if ( this.toolchains == null )
        {
            this.toolchains = new java.util.ArrayList<ToolchainModel>();
        }

        return this.toolchains;
    } //-- java.util.List<ToolchainModel> getToolchains()

    /**
     * Method removeToolchain.
     * 
     * @param toolchainModel a toolchainModel object.
     */
    public void removeToolchain( ToolchainModel toolchainModel )
    {
        getToolchains().remove( toolchainModel );
    } //-- void removeToolchain( ToolchainModel )

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
     * Set the toolchain instance definition.
     * 
     * @param toolchains a toolchains object.
     */
    public void setToolchains( java.util.List<ToolchainModel> toolchains )
    {
        this.toolchains = toolchains;
    } //-- void setToolchains( java.util.List )

}
