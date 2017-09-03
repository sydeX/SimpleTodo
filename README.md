# SimpleTodo

SimpleTodo is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Xin Yang

Time spent: 6 hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://i.imgur.com/M62hvjt.gif' width=''/>

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** 
I never had any mobile development experience before. I found Android development is very similar to web front-end development, where the layout and behaviors are implemented separately but also interwined. The way of defining a button's onClick behavior is very similar to html onClick property, and passing parameter and returning result code between pages are similar to making http calls. 
I like how the Android studio provides both design view and xml text view of the layout. It's easy to drag and drop components and position it to the desired location, whereas in front-end development there's a lot of work to make sure everything aligns perfectly. The property panel provides a very comprehensive view of all available properties that can be configured. I'm new to Android so maybe this already exists, but I have to build the app everytime I make a change to the layout for it take effect in the emulator, it would be more conventient if it can support real time updates like in front-end dev.  

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** 
The ArrayAdapter works like a buffer place between the view and the underlying data that populates the view. When the data is modified, the adapter temporarily holds the new data, transform it and flush it out to a view in specific format. I think the adapter is important because it allows objects with different types to be represented in a particular format. The 'ConvertView' is an old view to be reused which is less costly than re-instantiating a new view. ConvertView is null when getView() is being called for the first time, but when a view has been scrolled off the screen, a convertView is created and can be reused to display the data. 

## Notes

Describe any challenges encountered while building the app.

1. Had to adjust the contraint of the layout a few times to make sure it appears at the desired location of the screen, especially had to remember to align both vertically and horizontally.
2. When recording the demo, I had to enable the softkeyboard, but that pushes up the whole view and making the app title and upper list disappear. I had to google to figure out a specific setting need to be configured in the manifest in order for it to resize automatically.
3. In onCreate() of EditItemActivity, I had to make sure setContentView() was called first before referencing the EditText component.

## License

    Copyright [2017] [Xin Yang]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
