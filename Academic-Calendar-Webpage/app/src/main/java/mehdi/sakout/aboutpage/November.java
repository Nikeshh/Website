package mehdi.sakout.aboutpage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.nikeshhbaskaran.academiccalendar.R;

import java.util.Calendar;

public class November extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        simulateDayNight(/* DAY */ 0);
        Element adsElement = new Element();
        adsElement.setTitle("Advertise with us");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.november)
                .addItem(day1())
                .addItem(day2())
                .addItem(day3())
                .addItem(day4())
                .addItem(day5())
                .addItem(day6())
                .addItem(day7())
                .addItem(day8())
                .addItem(day9())
                .addItem(day10())
                .addItem(day11())
                .addItem(day12())
                .addItem(day13())
                .addItem(day14())
                .addItem(day15())
                .addItem(day16())
                .addItem(day17())
                .addItem(day18())
                .addItem(day19())
                .addItem(day20())
                .addItem(day21())
                .addItem(day22())
                .addItem(day23())
                .addItem(day24())
                .addItem(day25())
                .addItem(day26())
                .addItem(day27())
                .addItem(day28())
                .addItem(day29())
                .addItem(day30())
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);
    }

    Element day1() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_1), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CE6702-Prestressed Concrete Structures\n07-CS6702-Graphy Theory and Applications\n07-EI6704-Biomedical Instrumentation\n07-EC6009-Advanced Computer Architecture\n07-EC6011-Electro Magnetic Interference and Compatibility\n07-EC6010-Electronics Packaging\n07-EC6008-Web Technology\n07-EC6007-Speech Processing\nME6505-Dynamcis of Machines",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day2() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_2), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"05-CE6502-Foundation Engineering\n05-CS6501-Internet Programming\n05-ME6701-Power Plant Engineering\n03-EC6303-Signals and Systems\n07-ME6701-Power Plant Engineering",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }


    Element day3() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_3), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CE6703-Water Resources and Irrigation Engineering\n07-CS6703-Grid and Cloud Computing\n07-EE6701-High Voltage Engineering\n07-EC6015-Radar and Navigational Aids\n07-EC6013-Advanced Microprocessors and Microcontrollers\n07-EC6012-CMOS Analog IC Design\n07-EC6014-Cognitive Radio\n07-EC6016-Opto Electronic Devices\n05-ME6501-Computer Aided Design",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day4() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_4), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"05-CE6503-Environmental Engineering I\n05-CS6502-Object Oriented analysis and Design\n05-EE6501-Power System Analysis\n03-EC6302-Digital Electronics\n0-ME6703-Computer Integrated Manufacturing Systems",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day5() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_5), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(November.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    Element day6() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_6), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CE6704-Estimation and Quantity Surveying\n07-CS6704-Resource Management Techniques\n05-EE6502-Microprocessors and Microcontrollers\n07-EC6701-RF and Microwave Engineering",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day7() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_7), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"05-CE6504-Highway Engineering\n05-CS6503-Theory of Computation\n07-EE6702-Protection and Switchgear\n05-EC6502-Principles of Digital Signal Processing\n05-ME6502-Heat and Mass Transfer",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day8() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_8), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CE6009-Water Resources System Analysis\n07-CE6008-Groundwater Engineering\n07-CE6007-House planning and Management\n07-CE6006-Traffic Engineering and Management\n07-CS6003-Ad hoc and Sensor Networks\n07-CS6005-Advanced Database Systems\n07-BM6005-Bio Infromatics\n05-EE6504-Electrical Machines-II",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day9() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_9), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"05-CE6505-Design of Reinforced Concrete Elements\n07-IT6801-Service Oriented Architecture\n07-CS6004-Cyber Forensicss\n07-EE6703-Special Electrical Machines\n03-EC6301-Object Oriented Programming and Data Structures\n07-ME6702-Mechatronics",Snackbar.LENGTH_LONG).show();
    }
});
        return copyRightsElement;
    }

    Element day10() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_10), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CE6012-Ground Improvement Techniques\n07-CE6001-Air Pollution Management\n07-EN6801-Environemental Impact Assessment\n07-CE6023-Industrial Waste Management\n05-EE6503-Power Electronics\n07-EC6702-Optical Communication and Networks\n05-GE6075-Professional Ethics in Engineering\n07-ME6007-Computer Materials and Mechanics\n07-ME6005-Process Planning and Cost Estimation",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day11() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_11), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-CS6006-Game Programming\n07-IT6006-Data Analytics\n07-IT6005-Digital Image Processing\n07-CS6007-Infromation Retrieval\n07-IT6005-Digital Image Processing\n07-EC6005-Electronic Testing\n07-EC6006-Avionics\n07-EC6004-Satellite Communication",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day12() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_12), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(November.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    Element day13() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_13), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-GE6351-Environmental Science and Engineering",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day14() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_14), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-EN6501-Municipal Solid Waste Management\n07-EC6703-Embedded and Real Time Systems\n07-EE6004-Flexible AC Transmission Systems\n07-EE6005-Power Quality\n07-EE6006-Applied Soft Computing\n07-EC6703-Embedded and Real Time Systems\n05-ME6504-Metrology and Measurements\n07-ME6006-Design of Jigs,Fixtures and Press Tools",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day15() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_15), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"05-CE6506-Construction Techniques,Equipment and Practice\n03-CS6301-Programming and Data Structures-II\n07-EI6703-Fiber Optics and Laser Instruments\n03-EE6352-Electrical Engineering and Instrumentation\n05-EC6504-Microprocessor and Microcontroller\n07-ME6009-Energy Conservation and Mangement\n07-ME6008-Welding Technology",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day16() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_16), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-CE6302-Engineering Geology\n05-MA6566-Discrete Mathematics\03-EC6202-Electronic Devices and Circuits\n03-ME6302-Manufacturing Technology-I",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day17() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_17), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-CS6302-Database Management Systems\n07-EE6007-Micro Electro Mechanical Systems\n05-EC6501-Digital Communication\n07-EE6007-Micro Electro Mechanical Systems\n07-ME6011-Thermal Turbo Machines\n07-ME6010-Robotics\n07-ME6021-Hydrauics and Pneumatics",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day18() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_18), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-CE6302-Mechanics of Solids\n03-EE6301-Digital Logic Circuits\n07-MG6851-Principles of Management\n07-CS6012-Soft Computing\nEE6351-Electrical Drives and Controls",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day19() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_19), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(November.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    Element day20() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_20), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-MA6351-Transforms and Partial Differential Equations\n03-MA6351-Transforms and Partial Differential Equations\n03-MA6351-Transforms and Partial Differential Equationns",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day21() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_21), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-GE6757-Total Quality Management",Snackbar.LENGTH_LONG).show();

            }
        });
        return copyRightsElement;
    }

    Element day22() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_22), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"07-ME6012-Maintenance Engineering",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day23() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_23), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-GE6151-Computer Programming",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day24() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_24), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"03-CE6304-Surveying I\n03-CS6304-Analog and Digital Communication\n03-EE6303-Linear Integrated Circuits and Applications\n03-EC6304-Electronic Circuits-I\n03-CE6451-Fluid Mechanics and Machinery",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day25() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_25), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-GE6152-Engineering Graphics",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day26() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_26), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color2);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(November.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    Element day27() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_27), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-MA6151-Mathematics-I",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day28() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_28), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-PH6151-Engineering Physics-I",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day29() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_29), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-CY6151-Engineering Chemistry-I",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element day30() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.day11_30), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.icon);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.LEFT);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"01-HS6151-Technical English-I",Snackbar.LENGTH_LONG).show();
            }
        });
        return copyRightsElement;
    }

    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(November.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    void simulateDayNight(int currentSetting) {
        final int DAY = 0;
        final int NIGHT = 1;
        final int FOLLOW_SYSTEM = 3;

        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        if (currentSetting == DAY && currentNightMode != Configuration.UI_MODE_NIGHT_NO) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        } else if (currentSetting == NIGHT && currentNightMode != Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        } else if (currentSetting == FOLLOW_SYSTEM) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        }
    }
}
