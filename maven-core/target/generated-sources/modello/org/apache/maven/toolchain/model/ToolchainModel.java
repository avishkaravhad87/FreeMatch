// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.toolchain.model;

/**
 * Definition of a toolchain instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ToolchainModel
    extends TrackableBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *                     Type of toolchain:<ul>
     *                     <li><code>jdk</code> for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/jdk.html">JDK
     * Standard Toolchain</a>,</li>
     *                     <li>other value for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/custom.html">Custom
     * Toolchain</a></li>
     *                     </ul>
     *                     
     */
    private String type;

    /**
     * Field provides.
     */
    private java.util.Properties provides;

    /**
     * 
     *                     
     *                     <p>Toolchain configuration information,
     * like location or any information that is to be
     * retrieved.</p>
     *                     <p>Actual content structure is
     * completely open: each toolchain type will define its own
     * format and semantics.</p>
     *                     <p>In general, this is a properties
     * format: <code>&lt;name&gt;value&lt;/name&gt;</code> with
     *                     per-toolchain defined properties
     * names.</p>
     *                     
     */
    private Object configuration;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addProvide.
     * 
     * @param key a key object.
     * @param value a value object.
     */
    public void addProvide( String key, String value )
    {
        getProvides().put( key, value );
    } //-- void addProvide( String, String )

    /**
     * Method clone.
     * 
     * @return ToolchainModel
     */
    public ToolchainModel clone()
    {
        try
        {
            ToolchainModel copy = (ToolchainModel) super.clone();

            if ( this.provides != null )
            {
                copy.provides = (java.util.Properties) this.provides.clone();
            }

            if ( this.configuration != null )
            {
                copy.configuration = new org.codehaus.plexus.util.xml.Xpp3Dom( (org.codehaus.plexus.util.xml.Xpp3Dom) this.configuration );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- ToolchainModel clone()

    /**
     * Get <p>Toolchain configuration information, like location or
     * any information that is to be retrieved.</p>
     *                     <p>Actual content structure is
     * completely open: each toolchain type will define its own
     * format and semantics.</p>
     *                     <p>In general, this is a properties
     * format: <code>&lt;name&gt;value&lt;/name&gt;</code> with
     *                     per-toolchain defined properties
     * names.</p>
     * 
     * @return Object
     */
    public Object getConfiguration()
    {
        return this.configuration;
    } //-- Object getConfiguration()

    /**
     * Method getProvides.
     * 
     * @return Properties
     */
    public java.util.Properties getProvides()
    {
        if ( this.provides == null )
        {
            this.provides = new java.util.Properties();
        }

        return this.provides;
    } //-- java.util.Properties getProvides()

    /**
     * Get type of toolchain:<ul>
     *                     <li><code>jdk</code> for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/jdk.html">JDK
     * Standard Toolchain</a>,</li>
     *                     <li>other value for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/custom.html">Custom
     * Toolchain</a></li>
     *                     </ul>
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Set <p>Toolchain configuration information, like location or
     * any information that is to be retrieved.</p>
     *                     <p>Actual content structure is
     * completely open: each toolchain type will define its own
     * format and semantics.</p>
     *                     <p>In general, this is a properties
     * format: <code>&lt;name&gt;value&lt;/name&gt;</code> with
     *                     per-toolchain defined properties
     * names.</p>
     * 
     * @param configuration a configuration object.
     */
    public void setConfiguration( Object configuration )
    {
        this.configuration = configuration;
    } //-- void setConfiguration( Object )

    /**
     * Set <p>Toolchain identification information, which will be
     * matched against project requirements.</p>
     *                     <p>For Maven 2.0.9 to 3.2.3, the actual
     * content structure was completely open: each toolchain type
     * would define its own format and semantics.
     *                     In general, this was a properties
     * format.</p>
     *                     <p>Since Maven 3.2.4, the type for this
     * field has been changed to Properties to match the de-facto
     * format.</p>
     *                     <p>Each toolchain defines its own
     * properties names and semantics.</p>
     * 
     * @param provides a provides object.
     */
    public void setProvides( java.util.Properties provides )
    {
        this.provides = provides;
    } //-- void setProvides( java.util.Properties )

    /**
     * Set type of toolchain:<ul>
     *                     <li><code>jdk</code> for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/jdk.html">JDK
     * Standard Toolchain</a>,</li>
     *                     <li>other value for
     *                     <a
     * href="https://maven.apache.org/plugins/maven-toolchains-plugin/toolchains/custom.html">Custom
     * Toolchain</a></li>
     *                     </ul>
     * 
     * @param type a type object.
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

    
                
    /**
     * Method hashCode.
     * 
     * @return int
     */
    public int hashCode()
    {
        int result = 17;

        result = 37 * result + ( type != null ? type.hashCode() : 0 );
        result = 37 * result + ( provides != null ? provides.hashCode() : 0 );

        return result;
    } //-- int hashCode()
    
    /**
     * Method equals.
     * 
     * @param other
     * @return boolean
     */
    public boolean equals( Object other )
    {
        if ( this == other )
        {
            return true;
        }

        if ( !( other instanceof ToolchainModel ) )
        {
            return false;
        }

        ToolchainModel that = (ToolchainModel) other;
        boolean result = true;

        result = result && ( getType() == null ? that.getType() == null : getType().equals( that.getType() ) );
        result = result && ( getProvides() == null ? that.getProvides() == null : getProvides().equals( that.getProvides() ) );

        return result;
    } //-- boolean equals( Object )    
                
              
}
