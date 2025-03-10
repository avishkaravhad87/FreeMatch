// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.usability.plugin.io.xpp3;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;
import org.apache.maven.usability.plugin.Expression;
import org.apache.maven.usability.plugin.ExpressionDocumentation;
import org.codehaus.plexus.util.xml.pull.MXSerializer;
import org.codehaus.plexus.util.xml.pull.XmlSerializer;

/**
 * Class ParamdocXpp3Writer.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ParamdocXpp3Writer
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field NAMESPACE.
     */
    private static final String NAMESPACE = null;

    /**
     * Field fileComment.
     */
    private String fileComment = null;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method setFileComment.
     * 
     * @param fileComment a fileComment object.
     */
    public void setFileComment( String fileComment )
    {
        this.fileComment = fileComment;
    } //-- void setFileComment( String )

    /**
     * Method write.
     * 
     * @param writer a writer object.
     * @param expressionDocumentation a expressionDocumentation
     * object.
     * @throws java.io.IOException java.io.IOException if any.
     */
    public void write( Writer writer, ExpressionDocumentation expressionDocumentation )
        throws java.io.IOException
    {
        XmlSerializer serializer = new MXSerializer();
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  " );
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n" );
        serializer.setOutput( writer );
        serializer.startDocument( expressionDocumentation.getModelEncoding(), null );
        writeExpressionDocumentation( expressionDocumentation, "paramdoc", serializer );
        serializer.endDocument();
    } //-- void write( Writer, ExpressionDocumentation )

    /**
     * Method write.
     * 
     * @param stream a stream object.
     * @param expressionDocumentation a expressionDocumentation
     * object.
     * @throws java.io.IOException java.io.IOException if any.
     */
    public void write( OutputStream stream, ExpressionDocumentation expressionDocumentation )
        throws java.io.IOException
    {
        XmlSerializer serializer = new MXSerializer();
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  " );
        serializer.setProperty( "http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n" );
        serializer.setOutput( stream, expressionDocumentation.getModelEncoding() );
        serializer.startDocument( expressionDocumentation.getModelEncoding(), null );
        writeExpressionDocumentation( expressionDocumentation, "paramdoc", serializer );
        serializer.endDocument();
    } //-- void write( OutputStream, ExpressionDocumentation )

    /**
     * Method writeExpression.
     * 
     * @param expression a expression object.
     * @param serializer a serializer object.
     * @param tagName a tagName object.
     * @throws java.io.IOException java.io.IOException if any.
     */
    private void writeExpression( Expression expression, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        serializer.startTag( NAMESPACE, tagName );
        if ( expression.getSyntax() != null )
        {
            serializer.startTag( NAMESPACE, "syntax" ).text( expression.getSyntax() ).endTag( NAMESPACE, "syntax" );
        }
        if ( expression.getDescription() != null )
        {
            serializer.startTag( NAMESPACE, "description" ).text( expression.getDescription() ).endTag( NAMESPACE, "description" );
        }
        if ( expression.getConfiguration() != null )
        {
            serializer.startTag( NAMESPACE, "configuration" ).text( expression.getConfiguration() ).endTag( NAMESPACE, "configuration" );
        }
        if ( ( expression.getCliOptions() != null ) && ( expression.getCliOptions().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "cliOptions" );
            for ( Iterator iter = expression.getCliOptions().keySet().iterator(); iter.hasNext(); )
            {
                String key = (String) iter.next();
                String value = (String) expression.getCliOptions().get( key );
                serializer.startTag( NAMESPACE, "cliOption" );
                serializer.startTag( NAMESPACE, "key" ).text( key ).endTag( NAMESPACE, "key" );
                serializer.startTag( NAMESPACE, "value" ).text( value ).endTag( NAMESPACE, "value" );
                serializer.endTag( NAMESPACE, "cliOption" );
            }
            serializer.endTag( NAMESPACE, "cliOptions" );
        }
        if ( ( expression.getApiMethods() != null ) && ( expression.getApiMethods().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "apiMethods" );
            for ( Iterator iter = expression.getApiMethods().keySet().iterator(); iter.hasNext(); )
            {
                String key = (String) iter.next();
                String value = (String) expression.getApiMethods().get( key );
                serializer.startTag( NAMESPACE, "apiMethod" );
                serializer.startTag( NAMESPACE, "key" ).text( key ).endTag( NAMESPACE, "key" );
                serializer.startTag( NAMESPACE, "value" ).text( value ).endTag( NAMESPACE, "value" );
                serializer.endTag( NAMESPACE, "apiMethod" );
            }
            serializer.endTag( NAMESPACE, "apiMethods" );
        }
        if ( expression.getDeprecation() != null )
        {
            serializer.startTag( NAMESPACE, "deprecation" ).text( expression.getDeprecation() ).endTag( NAMESPACE, "deprecation" );
        }
        if ( expression.getBan() != null )
        {
            serializer.startTag( NAMESPACE, "ban" ).text( expression.getBan() ).endTag( NAMESPACE, "ban" );
        }
        if ( expression.isEditable() != true )
        {
            serializer.startTag( NAMESPACE, "editable" ).text( String.valueOf( expression.isEditable() ) ).endTag( NAMESPACE, "editable" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeExpression( Expression, String, XmlSerializer )

    /**
     * Method writeExpressionDocumentation.
     * 
     * @param expressionDocumentation a expressionDocumentation
     * object.
     * @param serializer a serializer object.
     * @param tagName a tagName object.
     * @throws java.io.IOException java.io.IOException if any.
     */
    private void writeExpressionDocumentation( ExpressionDocumentation expressionDocumentation, String tagName, XmlSerializer serializer )
        throws java.io.IOException
    {
        if ( this.fileComment != null )
        {
        serializer.comment(this.fileComment);
        }
        serializer.setPrefix( "", "http://maven.apache.org/PARAMDOC/1.0.0" );
        serializer.setPrefix( "xsi", "http://www.w3.org/2001/XMLSchema-instance" );
        serializer.startTag( NAMESPACE, tagName );
        serializer.attribute( "", "xsi:schemaLocation", "http://maven.apache.org/PARAMDOC/1.0.0 http://maven.apache.org/xsd/paramdoc-1.0.0.xsd" );
        if ( ( expressionDocumentation.getExpressions() != null ) && ( expressionDocumentation.getExpressions().size() > 0 ) )
        {
            serializer.startTag( NAMESPACE, "expressions" );
            for ( Iterator iter = expressionDocumentation.getExpressions().iterator(); iter.hasNext(); )
            {
                Expression o = (Expression) iter.next();
                writeExpression( o, "expression", serializer );
            }
            serializer.endTag( NAMESPACE, "expressions" );
        }
        serializer.endTag( NAMESPACE, tagName );
    } //-- void writeExpressionDocumentation( ExpressionDocumentation, String, XmlSerializer )

}
