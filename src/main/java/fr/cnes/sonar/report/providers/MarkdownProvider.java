/*
 * This file is part of cnesreport.
 *
 * cnesreport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * cnesreport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with cnesreport.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.cnes.sonar.report.providers;

import com.google.gson.JsonObject;

/**
 * Provides some markdown data
 * To DO : should inherit methods from abstract parent class
 */
public class MarkdownProvider {

    /** Needed property */
    private static final String MARKDOWN_DATA = "md-data";

    /**
     * Constructor
     * Not correctly implemented yet
     * Needs parent class definition
     */
    public MarkdownProvider() {
        // Don't forget to call super() at some point

        // Temporary for testing purposes
        getMarkdownData();
    }

    /**
     * Get markdown data
     * @return data
     */
    private void getMarkdownData() {
        // TO DO

        /**
         * Check parameters
         * Add logic to handle the web request
         * Retrieve useful parameters
         * Handle exceptions
         * Add exceptions to function definition
         */

        // Development is not finished yet
        JsonObject jsonObject = new JsonObject();
        jsonObject.getAsJsonObject(MARKDOWN_DATA).get("data").getAsString();
        
        // TO DO
        /**
         * How to get the data we need ?
         * There might be an issue with the data model
         * Some tests have to be done to determine the right approach
         * Will do in a future version
         */
    }

}