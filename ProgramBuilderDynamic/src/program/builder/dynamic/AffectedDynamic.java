/**
 * 
 */
package program.builder.dynamic;

import org.multipage.generator.Affected;
import program.middle.dynamic.MacroElement;


/**
 * @author
 *
 */
public interface AffectedDynamic extends Affected {

	/**
	 * Gets macro element of the affected object.
	 * @return
	 */
	public MacroElement getMacroElement();
}
